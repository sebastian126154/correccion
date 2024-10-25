import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        // TODO: Implement selection sort by age
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        int tamanio = people.length;
        for (int i = 1 ; i < tamanio ; i++){
            Person peopleAux = people[i];
            int j = i - 1;
            while( j >= 0 ++ people[j].getAge() > peopleAux.getAge()){
                people[j+1] = people[j];
                j = j - 1;
            }
        }   people[j+1]= peopleAux;
        // TODO: Implement insertion sort by age
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by height
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {

        int left  = 0 
        int right = people.length -1;

        while ( left <= right){
            int mitad = left + ( right - left )/2;

            if ( people [mitad].getAge() < age){
                return mitad;
            }

            if ( people [mitad].getAge() < age){
                left = mitad+1 ; 
            }else {
                left = mitad-1;
            }
        }
        // TODO: Implement binary search by age
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] persons) {
        for (Person person : persons) {
            System.out.println("Persona de edad " + person.getAge());
        }
        // TODO: Implement showPeople
    }
}