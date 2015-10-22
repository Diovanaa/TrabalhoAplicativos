/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.UTIL;

import MODEL.SubGrupoItem;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Rangel
 */
public class ComboBoxSubGrupoItem extends JLabel implements ListCellRenderer {

    public ComboBoxSubGrupoItem(){
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    
    @Override
    public Component getListCellRendererComponent(JList jlist, Object value,
    int index, boolean isSelected, boolean cellHasFocus) {
        
        if (value instanceof SubGrupoItem) {
            SubGrupoItem subGrupoItem = (SubGrupoItem) value;
            if (subGrupoItem != null) {
                setText(subGrupoItem.getDescricao());
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
