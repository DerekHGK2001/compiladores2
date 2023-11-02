import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import java.util.ArrayList;
import java.util.List;

public class CustomErrorListener extends BaseErrorListener {
    private final List<String> errores = new ArrayList<>();
    private final TokenStream tokens;

    public CustomErrorListener(TokenStream tokens) {
        this.tokens = tokens;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        String mensajeError = String.format("Error en la línea %d, Columna %d: %s", line, charPositionInLine, msg);

        // Obtener información adicional sobre el token ofensivo
        Token token = (Token) offendingSymbol;
        String tokenText = token.getText();

        mensajeError += "\nToken ofensivo: " + tokenText;

        errores.add(mensajeError);
    }

    public List<String> getErrores() {
        return errores;
    }

}