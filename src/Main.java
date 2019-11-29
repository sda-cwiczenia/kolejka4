public class Main {
    public static void main(String[] args) {

        Kolejka kolejka = new Kolejka();

        if (kolejka.isEmpty()) System.out.println("Kolejka jest pusta");

        kolejka.add(7);
        kolejka.add(5);
        kolejka.add(3);

        kolejka.show();
        System.out.println("Pierwszy element w kolejce to: "+kolejka.pop());
        System.out.println("Zdejmujemy element pierwszy");
        kolejka.push();
        kolejka.show();

        kolejka.add(4);
        kolejka.add(7);
        kolejka.add(0);
        kolejka.add(12);
        kolejka.show();

        kolejka.find(15);
        kolejka.delete(4);
        kolejka.show();
    }
}
