public class Main {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" +
                "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъыьэюя";

        for (int i = 0; i < alphabet.length() ; i++) {
            System.out.println(alphabet.charAt(i)+ " "+ (int)(alphabet.charAt(i)));
        }
    }
}
