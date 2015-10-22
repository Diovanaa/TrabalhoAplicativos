/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.UTIL;

import MODEL.UnidadeMedida;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Rangel
 */
public class ComboBoxUnidadeMedida extends JLabel implements ListCellRenderer {

    public ComboBoxUnidadeMedida() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }
    
    @Override
    public Component getListCellRendererComponent(JList jlist, Object value, 
    int index, boolean isSelected, boolean cellHasFocus) {
     
        if (value instanceof UnidadeMedida) {
            UnidadeMedida unidadeMedida = (UnidadeMedida) value;
            if (unidadeMedida != null) {
                setText(unidadeMedida.getSigla());
                setFont(jlist.getFont());
            }
        }
        if (isSelected) {
            setBackground(jlist.getSelectionBackground());
            setForeground(jlist.getSelectionForeground());
        } else {
            setBackground(jlist.getBackground());
            setForeground(jlist.getForeground());
        }
        return this;
        
    }
    
}
