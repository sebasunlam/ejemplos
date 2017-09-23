/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclasepoo;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

/**
 *
 * @author spardo
 */
public class Worker extends SwingWorker<Integer, Integer> {

    // Esta etiqueta se recibe en el constructor o a través de un
    // metodo setEtiqueta().
    private JLabel etiqueta;

    public Worker(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    protected void done() {

        etiqueta.setText("FIN!");
    }

    @Override
    protected void process(List<Integer> chunks) {
        this.etiqueta.setText(chunks.get(0).toString());
    }

    @Override
    protected Integer doInBackground() throws Exception {

        // Un simble bucle hasta 10, con esperas de un segundo entre medias.
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {

            }
            
            publish(i);
        }
        // El supuesto resultado de la operación.
        return 10;
    }
}
