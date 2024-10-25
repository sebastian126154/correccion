import models.Carro;

public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Ascendentemente
    /**
     * Ordena un arreglo de objetos Carro por año de fabricación en orden ascendente
     * utilizando el algoritmo de ordenamiento burbuja.
     *
     * @param cars Un arreglo de objetos Carro que se desea ordenar.
     */
    public void sortBYearWithBubbleAvnAsendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() > cars[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    public void sortBYearWithBubbleAvnDesendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() < cars[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] cars, int year) {
        int left = 0;
        int right = cars.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cars[mid].getYear() == year) {
                return mid;
            }
            if (cars[mid].getYear() < year) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Year not found
    }

    // Metodo que imprime el listado de personas
    public void showCars(Carro[] cars) {
        for (Carro car : cars) {
            System.out.println(car);
        }
    }
}