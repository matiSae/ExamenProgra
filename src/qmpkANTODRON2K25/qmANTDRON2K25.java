package qmpkANTODRON2K25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import qmpkANTODRON2K25.qmpkAntiCiberDron.qmAntiCiberDron;
import qmpkANTODRON2K25.qmpkAntiCiberDron.qmBBA;

public class qmANTDRON2K25 {

    private String qmNombre;
    private String qmCedula;

    //Refactorizacion
    private List<String[]> qmResultados = new ArrayList<>();


    public qmANTDRON2K25() {}

    public void qmInicializar() {
        qmPresentarDatos("Matías Quinchiguano", "1728482140");
        System.out.println("[+] COORDENADAS UCRANIANAS:\n");
        qmLeerArchivo();
        qmMostrarTablaFinal();
    }


    public void qmPresentarDatos(String nombre, String cedula) {
        System.out.println("[+] INFORMACIÓN:");
        System.out.println(" Nombre  : " + nombre);
        System.out.println(" Cédula  : " + cedula + "\n");
    }


    public void qmLeerArchivo() {

        try (BufferedReader br = new BufferedReader(new FileReader("QuinchiguanoMatias.csv"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                qmAnimacion();

                String[] col = linea.split(";");

                while (col.length < 7) {
                    linea += ";";
                    col = linea.split(";");
                }

                String formateado = String.format(
                    "%-10s | %-7s | %-7s | %-9s | %-7s | %-7s | %-10s",
                    col[0], col[1], col[2], col[3], col[4], col[5], col[6]
                );

                System.out.println("o0o   100%   " + formateado);

                String geo = col[0].trim();   
                String ta  = col[6].trim();   

                if (geo.endsWith("00") || geo.endsWith("04")) {

                    qmAntiCiberDron dron = new qmAntiCiberDron(new qmBBA());

                    boolean aceptado = dron.qmBuscar(ta);

                    if (aceptado) {
                        qmResultados.add(new String[]{geo, ta, "true"});
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("ERROR leyendo archivo CSV");
            e.printStackTrace();
        }

        System.out.println();
    }


//Refactorizacion
    public void qmMostrarTablaFinal() {

        System.out.println("COORDENADAS UCRANIANAS A DESTRUIR:");
        System.out.println("Geoposición | Tipo Arsenal | Acción");

        for (String[] fila : qmResultados) {
            System.out.println(fila[0] + " | " + fila[1] + " | " + fila[2]);
        }
    }

//Refactorizacion
    public void qmAnimacion() {
        try {
            String[] frames = {"o0o", "0o0", "o0o", "0o0"};

            for (int i = 0; i < 8; i++) {
                System.out.print("\r" + frames[i % frames.length]);
                Thread.sleep(120);
            }
            System.out.print("\r");

        } catch (Exception e) {}
    }
}
