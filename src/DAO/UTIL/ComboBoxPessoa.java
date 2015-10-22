/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.UTIL;

import MODEL.Pessoa;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ricardosassanovicz
 */
public class ComboBoxPessoa extends JLabel implements ListCellRenderer {

    public ComboBoxPessoa() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {


        if (value instanceof Pessoa) {
                Pessoa pessoa = (Pessoa) value;
                if (pessoa != null) {
                    setText(pessoa.getSexo());
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
