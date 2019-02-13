/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosSeparados;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Descifrar {
    /**
     * metod que desencripta la clabe en base 64
     * @param clave la clave para el descifrado
     * @param frase mensaje que se va a descifrar
     * @return 
     */
    public static String descifrarTresDes64(String frase,String clave){
        String salida = null;
        try{
            // paso de la clave a array de bytes
            byte[] bitClave = Arrays.copyOf(clave.getBytes("UTF-8"), 24);
            // objeto clave
            SecretKey key = new SecretKeySpec(bitClave, "DESede");
            Cipher cip = Cipher.getInstance("DESede");
            // indicamos la operacion que va a realiza el objeto para el desencriptado
            cip.init(cip.DECRYPT_MODE, key);
            byte[] bitFrase = CadenasBase64.descodificar(frase);
            byte[] bitSalida = cip.doFinal(bitFrase);
            salida = new String(bitSalida);
            
        }catch(Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
        
        return salida;
    }
    /**
     * metod que desencripta la clabe en base 64
     * @param clave la clave para el descifrado
     * @param frase mensaje que se va a descifrar
     * @return 
     */
    public static String descifrarAes25664(String frase,String clave){
        String salida = null;
        try{
            // paso de la clave a array de bytes
            byte[] bitClave = Arrays.copyOf(clave.getBytes("UTF-8"), 32);
            // objeto clave
            SecretKey key = new SecretKeySpec(bitClave, "AES");
            Cipher cip = Cipher.getInstance("AES/ECB/PKCS5Padding");
            // indicamos la operacion que va a realiza el objeto para el desencriptado
            cip.init(cip.DECRYPT_MODE, key);
            byte[] bitFrase = CadenasBase64.descodificar(frase);
            byte[] bitSalida = cip.doFinal(bitFrase);
            salida = new String(bitSalida);
            
        }catch(Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        return salida;
    }
    /**
     * metod que desencripta la clabe en base 64
     * @param clave la clave para el descifrado
     * @param frase mensaje que se va a descifrar
     * @return 
     */
    public static String descifrarAes12864(String frase,String clave){
        String salida = null;
        try{
            // paso de la clave a array de bytes
            byte[] bitClave = Arrays.copyOf(clave.getBytes("UTF-8"), 16);
            // objeto clave
            SecretKey key = new SecretKeySpec(bitClave, "AES");
            Cipher cip = Cipher.getInstance("AES/ECB/PKCS5Padding");
            // indicamos la operacion que va a realiza el objeto para el desencriptado
            cip.init(cip.DECRYPT_MODE, key);
            byte[] bitFrase = CadenasBase64.descodificar(frase);
            byte[] bitSalida = cip.doFinal(bitFrase);
            salida = new String(bitSalida);
            
        }catch(Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
        
        return salida;
    }
}
