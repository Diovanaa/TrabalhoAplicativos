
package DAO.UTIL;

import MODEL.GrupoColaborador;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBoxGrpColaborador extends JLabel implements ListCellRenderer {

    public ComboBoxGrpColaborador() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList jlist,
            Object value,
            int index, boolean isSelected, boolean cellHasFocus) {

        if (value instanceof GrupoColaborador) {
            GrupoColaborador grupoColaborador = (GrupoColaborador) value;
            if (grupoColaborador != null) {
                setText(grupoColaborador.getDescricao());
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
