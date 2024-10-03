package Java_Assignments_October.Conditionals;

public class Coffee_Sizes {

    public static void main(String[] args) {


        String coffee = "small";


        switch (coffee.replaceAll(" " , "").toLowerCase())
        {
            case "small":
                System.out.println("Small: \"$2\"");
                break;
            case "medium":
                System.out.println("Medium: \"$3\"");
                break;
            case "larg":
                System.out.println("Large: \"$4\"");
                break;
            case "extralarge":
                System.out.println("Extra Large: \"$5\"");
                break;
            default:
                System.out.println("We don't serve that size here");
        }



    }

}
