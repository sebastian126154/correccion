
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        PersonasGenerator generator = new PersonasGenerator();

        // Obtener el arreglo de 50 Persons generadas aleatoriamente
        Person[] personas = generator.generarPersonas();

        System.out.println("Listado de Persons generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByAgeWithInsertion(personas);
        mOB.showPeople(personas);
        int result = mOB.searchBinaryByAge(personas, 78);
        if (result == -1) {
            System.out.println("No encontro ");
        } else {
            System.out.println("encontro en la posicion " + result + "->" + personas);
        }

    }
}
