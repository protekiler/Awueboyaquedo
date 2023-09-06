package org.example.modelo;
import org.example.Persistencia.PersonaDAO;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaPersona implements TableModel {
    public static final int COLUMS=3;
    private ArrayList<Persona> datos;
    private PersonaDAO pdao;

    public ModeloTablaPersona() {
        pdao=new PersonaDAO();
        datos=new ArrayList<>();
    }

    public ModeloTablaPersona(ArrayList<Persona> datos) {
        this.datos = datos;
        pdao=new PersonaDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Apellido";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    @Override
    public Object getValueAt(int filIndex, int columnIndex) {
        Persona tmp=datos.get(filIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getApellido();
        }
        return null;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //id
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setApellido((String) aValue);
            default:
                System.out.println("No se modifico nada");
        }
        // Actualizar el registro en la base de datos
        try {
            pdao.update(datos.get(rowIndex));
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos() {
        try {
            ArrayList<Persona> tirar = pdao.obtenerTodo();
            System.out.println(tirar);
            datos = pdao.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }
    public boolean agregarAnimal(Persona persona) {
        boolean resultado = false;
        try {
            if (pdao.insertar(persona)) {
                datos.add(persona);
                resultado = true;

            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Persona getPersonaIndex(int idx) {
        return datos.get(idx);
    }
    public boolean ActualizarPersona(Persona persona) {
        boolean resultado = true;
        try {
            if (pdao.update(persona)) {
                datos.add(persona);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());

        }
        return resultado;
    }
}
