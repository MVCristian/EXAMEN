/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) throws Exception {
        Dispositivos dispositivo1 = new Ordenador("HP", "Ordenador de sobremesa de 17' con un i7 9500K y 12GB de RAM", 599.99);
        Dispositivos dispositivo2 = new TerminalDeVenta("a", "Putno de venta con NFC incluido", 99.99);
        Dispositivos dispositivo3 = new Tablet("iPad Air", "Tamaño de 9,7' y cuenta con una resolución de 2048 X 1536.", 650.99);
        Dispositivos dispositivo4 = new Portatil("Asus", "Portátil de 17' con un Intel Celeron y 4GB de RAM", 349.99);
        
        dispositivo4.Reset();
        dispositivo3.Reset();
        //Aquí no dejará
        try {
            dispositivo2.Reset();
        } catch(Exception error){
            System.out.println("Error no se puede realizar esta acción");
        }
        
        System.out.println(dispositivo1);
        dispositivo2.conecta();
        dispositivo2.desconecta();
    }
    
    
}
