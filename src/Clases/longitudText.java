package Clases;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Clase para controlar la longitud de un JTextField
 * @author Borja Andrades
 */
public class longitudText extends PlainDocument {

    /**
     * parametro con el maximo de longitud
     */
    private int maxLength;

    /**
     * Se le debe pasar por parámetro el numero máximo de caracteres permitidos
     * @param maxLength maximo de caracteres
     */
    public longitudText(int maxLength) {
        this.maxLength = maxLength;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(getLength() + str.length() <= maxLength) {
            super.insertString(offs, str, a);
        }
    }
    }