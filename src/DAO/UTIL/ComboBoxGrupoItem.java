/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.UTIL;

import MODEL.GrupoItem;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Rangel
 */
public class ComboBoxGrupoItem extends JLabel implements ListCellRenderer {

    public ComboBoxGrupoItem() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList jlist,
            Object value,
            int index, boolean isSelected, boolean cellHasFocus) {

        if (value instanceof GrupoItem) {
            GrupoItem grupoItem = (GrupoItem) value;
            if (grupoItem != null) {
                setText(grupoItem.getDescricao());
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
