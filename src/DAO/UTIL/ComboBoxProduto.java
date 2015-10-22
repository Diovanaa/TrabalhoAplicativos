
package DAO.UTIL;

import MODEL.Produto;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBoxProduto extends JLabel implements ListCellRenderer {
    
    public ComboBoxProduto() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if(value instanceof Produto){
            Produto produto = (Produto)value;
            if(produto != null){
                setText(produto.getDescricao());
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
