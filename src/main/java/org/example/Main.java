import org.example.DeliverooFalcariException;

import static java.lang.IO.println;

void main()
{
    try {
        F();
    } catch (DeliverooFalcariException e) {
        println("Errore: " + e + "\nStackTrace: " + Arrays.toString(e.getStackTrace()) + "\nStatus Code: " + e.getStatusCode());
    }

    // stacktrace: allora, sotto lo stack ( alla base ), mettiamo il Main
    // main chiama -> f
    // f - > g
    // g - > h
    // h finisce e va via dallo stack
    // g -> l
    // l lancia un eccezione e la propaga !
    // percio l'exception va a g
    // che va a f
    // che va al main
    // e il main deve propagarla all'utente se non gestita

}

private void F() throws DeliverooFalcariException
{
    G();
}

private void G() throws DeliverooFalcariException
{
    H();
    L();
}

private void H()
{
    return;
}

private void L() throws DeliverooFalcariException // o la propago
{
    //throw new Exception("Eccezione lanciata in L"); // o faccio il try catch
    throw new DeliverooFalcariException("gatto", 10);
}