
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

import models.ModelArchCSV;
import views.ViewArchCSV;

public class ControllerArchCSV {
    
    ModelArchCSV modelcsv; // Crea un objeto para acceder al contenido del Model.
    ViewArchCSV viewcsv; // Crea un objeto para acceder al contenido de la View.
    
        ActionListener actionlistener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewcsv.jb_guardar) { // Comprueba si se selecciona el botón "Guardar".
                jb_guardar_action_performed();
            }
            else if (e.getSource() == viewcsv.jb_nuevo) { // Comprueba si se selecciona el botón "Nuevo".
                jb_nuevo_action_performed();
            }
            else if (e.getSource() == viewcsv.jb_primero) { // Comprueba si se selecciona el botón "Primer registro".
                jb_primero_action_performed();
            }
            else if (e.getSource() == viewcsv.jb_anterior) { // Comprueba si se selecciona el botón "registro Anterior".
                jb_anterior_action_performed();
            }
            else if (e.getSource() == viewcsv.jb_siguiente) { // Comprueba si se selecciona el botón "registro Siguiente".
                jb_siguiente_action_performed();
            }
            else if (e.getSource() == viewcsv.jb_ultimo) { // Comprueba si se selecciona el botón "Último registro".
                jb_ultimo_action_performed();
            }
        }
    };
    
    /**
     * Método para integrar los componentes del módelo MVC.
     * @param modelArchCSV
     * @param viewArchCSV 
     */
    public ControllerArchCSV(ModelArchCSV modelArchCSV, ViewArchCSV viewArchCSV) {
        this.modelcsv = modelArchCSV;
        this.viewcsv = viewArchCSV;
        
        this.viewcsv.jb_guardar.addActionListener(actionlistener);
        this.viewcsv.jb_nuevo.addActionListener(actionlistener);
        this.viewcsv.jb_primero.addActionListener(actionlistener);
        this.viewcsv.jb_anterior.addActionListener(actionlistener);
        this.viewcsv.jb_siguiente.addActionListener(actionlistener);
        this.viewcsv.jb_ultimo.addActionListener(actionlistener);
        initComponents();
        
        this.readFirst(modelcsv.getPath()); // Llama al método para mostrar el primer registro al ejecutar la aplicación.
    }
    
    /**
     * Método para el botón "Guardar" de la interfaz (ViewArchCSV).
     */
    public void jb_guardar_action_performed() {
        String nombre = viewcsv.jtf_nombre.getText();
        String email = viewcsv.jtf_email.getText();
        String registro = nombre + "," + email;
        modelcsv.setMessage(registro);
        this.writeFile(modelcsv.getPath(), modelcsv.getMessage()); // Lama al método para guardar el nuevo registro.
        this.readLast(modelcsv.getPath()); // Llama al método para mostrar el último registro almacenado, y poder moverse entre los registros.
    }
    
    /**
     * Método para el botón "Nuevo" de la interfaz (ViewArchCSV).
     */
    public void jb_nuevo_action_performed() {
        viewcsv.jtf_nombre.setText("");
        viewcsv.jtf_email.setText("");
    }
    
    /**
     * Método para el botón "Primer registro" de la interfaz (ViewArchCSV).
     */
    public void jb_primero_action_performed() {
        this.readFirst(modelcsv.getPath());
    }
    /**
     * Método para el botón "registro Anterior" de la interfaz (ViewArchCSV).
     */
    public void jb_anterior_action_performed() {
        this.readPrevious(modelcsv.getPath());
    }
    /**
     * Método para el botón "registro Siguiente" de la interfaz (ViewArchCSV).
     */
    public void jb_siguiente_action_performed() {
        this.readNext(modelcsv.getPath());
    }
    /**
     * Método para el botón "Último registro" de la interfaz (ViewArchCSV).
     */
    public void jb_ultimo_action_performed() {
        this.readLast(modelcsv.getPath());
    }
    
    
// Métodos para la lectura y escritura del archivo CSV...
    
    /**
     * Método para mostrar en los campos de texto el primer registro del archivo .csv.
     * @param path: Indica la ruta de almacenamiento del archivo a manipular.
     * @return 
     */
    public String readFirst (String path) {
        try {
            String row; // Variable que indica una "fila".
            String acumulador_texto = ""; // Variable para acumular todos los registros del .csv.
            try (FileReader archivo = new FileReader(path)) { // Permite leer el contenido del archivo.
                BufferedReader bufferedreader = new BufferedReader(archivo); // Permite almacenar el contenido del archivo .csv de forma temporal.
                
//                int num_lineas = 0;
                while ((row = bufferedreader.readLine()) != null ) {
//                    num_lineas = num_lineas + 1; // Contador de lineas CSV.
                    acumulador_texto += row + "#"; // Acumulador de lineas CSV.
                }
                String registros[] = acumulador_texto.split("#"); // Separa los registros por el caracter asignado (#).
                modelcsv.setPosition(0); // Asigna el valor de la posición deseada del registro.
                String registro[] = registros[modelcsv.getPosition()].split(","); // Separa el primer registro por el caracter especial CSV (,).
                viewcsv.jtf_nombre.setText(registro[0]);
                viewcsv.jtf_email.setText(registro[1]);
            }
        }
        catch (FileNotFoundException err) { // Detecta un error en caso de no encontrar el archivo en el path indicado.
            System.err.println("Archivo no encontrado: " + err.getMessage());
        }
        catch (IOException err) { // Marca error en caso de no contar con los permisos para acceder al archivo indicado.
            System.err.println("Error en operación I/O: " + err.getMessage());
        }
        return null;
    };
    /**
     * Método para mostrar en los campos de texto el último registro del archivo .csv.
     * @param path: Indica la ruta de almacenamiento del archivo a manipular.
     * @return 
     */
    public String readLast (String path) {
        try {
            String row; // Variable que indica una "fila".
            String acumulador_texto = ""; // Variable para acumular todos los registros del .csv.
            try (FileReader archivo = new FileReader(path)) { // Permite leer el contenido del archivo.
                BufferedReader bufferedreader = new BufferedReader(archivo); // Permite almacenar el contenido del archivo .csv de forma temporal.
                
                int num_lineas = 0;
                while ((row = bufferedreader.readLine()) != null ) {
                    num_lineas = num_lineas + 1; // Contador de lineas CSV.
                    acumulador_texto += row + "#"; // Acumulador de lineas CSV.
                }
                String registros[] = acumulador_texto.split("#"); // Separa los registros por el caracter asignado (#).
                modelcsv.setPosition(num_lineas - 1); // Asigna el valor de la posición deseada del registro.
                String registro[] = registros[modelcsv.getPosition()].split(","); // Separa el último registro por el caracter especial CSV (,).
                viewcsv.jtf_nombre.setText(registro[0]);
                viewcsv.jtf_email.setText(registro[1]);
            }
        }
        catch (FileNotFoundException err) { // Detecta un error en caso de no encontrar el archivo en el path indicado.
            System.err.println("Archivo no encontrado: " + err.getMessage());
        }
        catch (IOException err) { // Marca error en caso de no contar con los permisos para acceder al archivo indicado.
            System.err.println("Error en operación I/O: " + err.getMessage());
        }
        return null;
    };
    /**
     * Método para mostrar en los campos de texto el siguiente registro del archivo .csv.
     * @param path: Indica la ruta de almacenamiento del archivo a manipular.
     * @return 
     */
    public String readPrevious (String path) {
        try {
            String row; // Variable que indica una "fila".
            String acumulador_texto = ""; // Variable para acumular todos los registros del .csv.
            try (FileReader archivo = new FileReader(path)) { // Permite leer el contenido del archivo.
                BufferedReader bufferedreader = new BufferedReader(archivo); // Permite almacenar el contenido del archivo .csv de forma temporal.
                
//                int num_lineas = 0;
                while ((row = bufferedreader.readLine()) != null ) {
//                    num_lineas = num_lineas + 1; // Contador de lineas CSV.
                    acumulador_texto += row + "#"; // Acumulador de lineas CSV.
                }
                String registros[] = acumulador_texto.split("#"); // Separa los registros por el caracter asignado (#).
                modelcsv.setPosition(modelcsv.getPosition() - 1); // Asigna el valor de la posición deseada del registro.
                if (modelcsv.getPosition() >= 0) {
                    String registro[] = registros[modelcsv.getPosition()].split(","); // Separa el siguiente registro por el caracter especial CSV (,).
                    viewcsv.jtf_nombre.setText(registro[0]);
                    viewcsv.jtf_email.setText(registro[1]);
                }
                else {
                    modelcsv.setPosition(modelcsv.getPosition() + 1); // Pone a la variable un valor correcto después del error.
                    JOptionPane.showMessageDialog(null, "Movimiento no posible. Este es el primer registro.");
                }
            }
        }
        catch (FileNotFoundException err) { // Detecta un error en caso de no encontrar el archivo en el path indicado.
            System.err.println("Archivo no encontrado: " + err.getMessage());
        }
        catch (IOException err) { // Marca error en caso de no contar con los permisos para acceder al archivo indicado.
            System.err.println("Error en operación I/O: " + err.getMessage());
        }
        return null;
    };
    /**
     * Método para mostrar en los campos de texto el siguiente registro del archivo .csv.
     * @param path: Indica la ruta de almacenamiento del archivo a manipular.
     * @return 
     */
    public String readNext (String path) {
        try {
            String row; // Variable que indica una "fila".
            String acumulador_texto = ""; // Variable para acumular todos los registros del .csv.
            try (FileReader archivo = new FileReader(path)) { // Permite leer el contenido del archivo.
                BufferedReader bufferedreader = new BufferedReader(archivo); // Permite almacenar el contenido del archivo .csv de forma temporal.
                
                int num_lineas = 0;
                while ((row = bufferedreader.readLine()) != null ) {
                    num_lineas = num_lineas + 1; // Contador de lineas CSV.
                    acumulador_texto += row + "#"; // Acumulador de lineas CSV.
                }
                String registros[] = acumulador_texto.split("#"); // Separa los registros por el caracter asignado (#).
                modelcsv.setPosition(modelcsv.getPosition() + 1); // Asigna el valor de la posición deseada del registro.
                if (modelcsv.getPosition() < num_lineas) {
                    String registro[] = registros[modelcsv.getPosition()].split(","); // Separa el siguiente registro por el caracter especial CSV (,).
                    viewcsv.jtf_nombre.setText(registro[0]);
                    viewcsv.jtf_email.setText(registro[1]);
                }
                else {
                    modelcsv.setPosition(modelcsv.getPosition() - 1); // Pone a la variable un valor correcto después del error.
                    JOptionPane.showMessageDialog(null, "Movimiento no posible. Este es el ultimo registro.");
                }
            }
        }
        catch (FileNotFoundException err) { // Detecta un error en caso de no encontrar el archivo en el path indicado.
            System.err.println("Archivo no encontrado: " + err.getMessage());
        }
        catch (IOException err) { // Marca error en caso de no contar con los permisos para acceder al archivo indicado.
            System.err.println("Error en operación I/O: " + err.getMessage());
        }
        return null;
    };
    
    
    /**
     * Método para guardar un nuevo registro en el archivo .csv.
     * @param path: Indica la ruta de almacenamiento del archivo a manipular.
     * @param message: Variable que almacena el contenido del área de texto.
     */
    public void writeFile (String path, String message) {
        try {
            File archivo = new File(path); // Abre el archivo de la ruta especificada, si no existe, lo crea (según el path o ruta).
            FileWriter filewriter = new FileWriter(archivo, true); // Permite subreescribir (parámetro 'true') en el archivo especificado.
            
            try (PrintWriter printwriter = new PrintWriter(filewriter) ) { // Permite guardar el nuevo contenido en del archivo especificado.
                printwriter.println(message);
                printwriter.close();
            }
        }
        catch (FileNotFoundException err) { // Detecta un error en caso de no encontrar el archivo en el path indicado.
            System.err.println("Archivo no encontrado: " + err.getMessage());
        }
        catch (IOException err) { // Marca error en caso de no contar con los permisos para acceder al archivo indicado.
            System.err.println("Error en operación I/O: " + err.getMessage());
        }
    }
    
    
    /**
     * Método para acceder a los componentes de la interfaz "ViewArchCSV".
     */
    public void initComponents() {
        viewcsv.setVisible(true);
    }
    
}
