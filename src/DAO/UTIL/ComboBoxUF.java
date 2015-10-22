package DAO.UTIL;

import MODEL.UnidadeFederativa;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBoxUF extends JLabel implements ListCellRenderer {

    public ComboBoxUF() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {

        if (value instanceof UnidadeFederativa) {
            UnidadeFederativa unidadeFederativa = (UnidadeFederativa) value;
            if (unidadeFederativa != null) {
                setText(unidadeFederativa.getSigla());
                setFont(list.getFont());

            }
        }

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;

    }
}
