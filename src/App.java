// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Dog scottishTerrier = new Dog("Scottish Terrier", "Black", "Male", "Trimmed", 1, 20);
        
        System.out.println("This " + scottishTerrier.getSexType() + " dog is a "  + scottishTerrier.getCoatColor() + " " + scottishTerrier.getBreed() + " with " + scottishTerrier.getEarType() + " ears. This " + scottishTerrier.getBreed() + " is approximately " + scottishTerrier.getHeight() + " ft tall and weighs roughly " + scottishTerrier.getWeight() + " lbs.");

        scottishTerrier.isBarking();
        System.out.println();

        Cat calico = new Cat("Calico", "Black, White, Orange", "Female", "Trimmed", 1, 7);

        System.out.println("This " + calico.getSexType() + " dog is a "  + calico.getCoatColor() + " " + calico.getBreed() + " with " + calico.getEarType() + " ears. This " + calico.getBreed() + " is approximately " + calico.getHeight() + " ft tall and weighs roughly " + calico.getWeight() + " lbs.");

        calico.isBarking();

    }

}
