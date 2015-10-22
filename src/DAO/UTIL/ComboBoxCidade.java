
package DAO.UTIL;

import MODEL.Cidade;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBoxCidade extends JLabel implements ListCellRenderer{
   
    public ComboBoxCidade() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        
        if(value instanceof Cidade){
            Cidade cidade = (Cidade)value;
            if(cidade != null){
                setText(cidade.getNome());
                setFont(list.getFont());
                
            }
        }
        
        if (isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }else{
         setBackground(list.getBackground());
         setForeground(list.getForeground());
        }

        return this;    
    }
    
}
