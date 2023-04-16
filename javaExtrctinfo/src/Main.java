public class Main {
    public static void main(String[] args) {
        String sen = "My github portfiol is amazing, people give me star.";
//indexOf is to add specfic location to seprate.
        int index = sen.indexOf(",");
        
        System.out.println(sen.substring(0, index).toUpperCase());
        System.out.println(sen.substring(index+1).toUpperCase());
    }
}