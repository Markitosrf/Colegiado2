/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Colegiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String canmas = null;
        double masdur = 0;
        Cancion arrCancion[] = new Cancion[10];
          for(int i=1;i<11; i++){ 
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de la cancion "+i);
            String titulo = JOptionPane.showInputDialog("Escriba el titulo de la cancion");
            int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el id de la cancion"));
            String autor = JOptionPane.showInputDialog("Escriba el autor de la canciion");
            int anio = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el año de la cancion"));
            double duracion = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba la duracion de la cancion"));
            arrCancion[i]=new Cancion(titulo,id,autor,anio,duracion);     
        }
        for(int z=1; z<11; z++){
            if (arrCancion[z].getAnio()<2024){
                JOptionPane.showMessageDialog(null, arrCancion[z].getTitulo()+" Es de los años anteriores");
            }
        }
        for(int w=1; w<11; w++){
            if (arrCancion[w].getAnio()==2024){
                JOptionPane.showMessageDialog(null, arrCancion[w].getTitulo()+" Es de el año actual");
            }
        }
        for(int x=1; x<11; x++){
            if (arrCancion[x].getAnio()>2024){
                JOptionPane.showMessageDialog(null, arrCancion[x].getTitulo()+" Es de los años posteriores");
            }
        }
        for(int r=1; r<11; r++){
            if (arrCancion[r].getDuracion()<masdur){
              masdur=arrCancion[r].getDuracion(); 
              canmas= arrCancion[r].getTitulo();
            }
        }
        JOptionPane.showMessageDialog(null, canmas+" es la cancion mas larga");
        for(int t=1; t<11; t++){
           JOptionPane.showMessageDialog(null, arrCancion[t].getTitulo());
        } 
    }
}
      
