package javalabs.javatask06.musicshop;

public class WrongKeyValueOfInstrumentException extends RuntimeException {
    public WrongKeyValueOfInstrumentException() {
        super("Unexisting type of key name of the instrument in order!");
    }
}
