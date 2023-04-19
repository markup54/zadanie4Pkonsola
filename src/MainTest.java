import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void szyfrujProgram() {
        String oczekiwana = "OYPAYGM";
        String aktualna = Main.szyfruj("PROGRAM","GADERYPOLUKI");
        assertEquals(oczekiwana,aktualna);
    }
    @Test
    void szyfrujMaleLitery(){
        String oczekiwana = "oypaygm";
        String aktualna = Main.szyfruj("program","gaderypoluki");
        assertEquals(oczekiwana,aktualna);
    }
    @Test
    void szyfrujKluczPusty(){
        String oczekiwana = "program";
        String aktualna = Main.szyfruj("program","");
        assertEquals(oczekiwana,aktualna);
    }
    @Test
    void szyfrujKluczNieparzysty(){
        String oczekiwana = "oypaygmk";
        String aktualna = Main.szyfruj("programk","gaderypoluk");
        assertEquals(oczekiwana,aktualna);
    }
}