package day_14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = " Java is fun, I love learing java";
        String str2 = str.replace("Java" , "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "noumanbabak97@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println("email = " + email);

        String sentence = " java java python python c# c# c++ c++ python python python python";
        String sentence2 = sentence.replace("python", ""). replace(" "," ");

        sentence2.replace("   "," ");
        System.out.println("sentence2 = " + sentence2);

        String animal = "Dog Dog Dog Dog Dog";
        animal = animal.replace("Dog", "Cut");
        System.out.println("animal = " + animal);

        String s2 = "C# is fun, C# is coll";
        s2 = s2.replace("C# is c"," Java is c");
        System.out.println("s2 = " + s2);

        String s3 = "Java ";
        s3= s3.replace("a","e");
        System.out.println("s3 = " + s3);

        System.out.println("__________________________________");

        String result = "Java Java Java";

        result = result.replaceFirst("Java",  "Python");
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is coll";
        result2 = result.replaceFirst("C#", "Java");
        System.out.println(result2);








    }


}
