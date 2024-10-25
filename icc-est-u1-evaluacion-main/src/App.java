import models.Person;
import models.PersonasGenerator;
import models.Carro;
import models.CarrosGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros generadas:");

        MetodosOrdenamientoBusquedaGrupoB metodos = new MetodosOrdenamientoBusquedaGrupoB();
        metodos.sortBYearWithBubbleAvnAsendente(carros);
        metodos.showCars(carros);

        int result = metodos.searchBinaryByYear(carros, 200);
        if (result == -1) {
            System.out.println("No se encontro el carro");
        } else {
            System.out.println("El carro se encuentra en la posicion: " + result);
        }

        PersonasGenerator personasGenerator = new PersonasGenerator();

        // Obtener el arreglo de 50 Persons generadas aleatoriamente
        Person[] personas = personasGenerator.generarPersonas();

        System.out.println("Listado de Persons generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByAgeWithSelection(personas);
        mOB.showPeople(personas);
        int result2 = mOB.searchBinaryByAge(personas, 78);
        if (result2 == -1) {
            System.out.println("No encontro ");
        } else {
            System.out.println("encontro en la posicion " + result2 + "->" + personas);
        }

        // CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        // Carro[] carros = generator.generarCarros();

        // System.out.println("Listado de carros generadas:");

        // MetodosOrdenamientoBusquedaGrupoB metodos = new
        // MetodosOrdenamientoBusquedaGrupoB();
        // metodos.sortBYearWithBubbleAvnAsendente(carros);
        // metodos.showCars(carros);

        // int result = metodos.searchBinaryByYear(carros, 200);
        // if (result == -1) {
        // System.out.println("No se encontro el carro");
        // } else {
        // System.out.println("El carro se encuentra en la posicion: " + result);
        // }

    }

}
