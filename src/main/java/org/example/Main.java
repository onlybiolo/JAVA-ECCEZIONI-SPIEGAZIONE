import static java.lang.IO.println;

void main()
{
    try {
        throw new RuntimeException();
    } catch (Exception e) {
        println("Errore: " + e);
    }
}