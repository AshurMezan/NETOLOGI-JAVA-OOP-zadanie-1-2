public class Main {
    public static void main(String[] args) {
        int weight = 90; // Вес в кг
        double growth = 1.8; // Рост в сантиметрах
        double massEffect = weight / (growth * growth); // Формула расчёта

        if (massEffect < 16.5) {
            System.out.println("Ваш индекс массы тела: " + massEffect + " У вас выраженный дефицит массы.");
        } else if (massEffect < 18.5) {
            System.out.println("Ваш индекс массы тела: " + massEffect + " У вас недостаточная (дефицит) масса тела.");
        } else if (massEffect < 25) {
            System.out.println("Ваш индекс массы тела: " + massEffect + " У вас нормальный вес здорового человека.");
        } else if (massEffect < 30) {
            System.out.println("Ваш индекс массы тела: " + massEffect + " У вас избыточная масса тела.");
        } else if (massEffect < 35) {
            System.out.println("Ваш индекс массы тела: " + massEffect + " У вас ожирение первой степени.");
        } else if (massEffect < 40) {
            System.out.println("Ваш индекс массы тела: " + massEffect + " У вас ожирение второй степени.");
        } else if (massEffect >= 40) {
            System.out.println("Ваш индекс массы тела: " + massEffect + " У вас ожирение третьей степени.");
        }
    }
}
