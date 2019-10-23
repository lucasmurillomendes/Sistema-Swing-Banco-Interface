/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.util;

import br.edu.ifpr.bean.Categoria;
import br.edu.ifpr.bean.Marca;
import br.edu.ifpr.bean.Municipio;
import br.edu.ifpr.bean.Proprietario;
import br.edu.ifpr.bean.Veiculo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class VeiculoTableModel extends AbstractTableModel{

    private final String[] colunas = {"ID", "Placa", "Ano", "Categoria", 
                                        "Proprietário", "Marca", "Municipio"};
    private List<Veiculo> dados;
    
    public VeiculoTableModel() {
        this.dados = new ArrayList<>();
    }

    /**
     * Adiciona um objeto cliente na lista dados
     * e atualiza o JTable
     * 
     * @param v
     */
    public void addLinha(Veiculo v) {
        this.dados.add(v);
        // Avisa a JTable que houve mudança
        // na estrutura de dados (variável dados)
        this.fireTableDataChanged();
    }
    
    /**
     * Retorna o cliente de uma determinada linha
     * 
     * @param linha
     * @return Cliente
     */
    public Veiculo getVeiculo(int linha) {
        return this.dados.get(linha);
    }
    
    /**
     * Remove uma determinada linha da tabela
     * 
     * @param linha 
     */
    public void removeLinha(int linha) {
        this.dados.remove(linha);
        // Avisa a JTable que houve mudança
        // na estrutra de dados (variável dados)
        this.fireTableDataChanged();
    }
    
    /**
     * Retorna o nome das colunas da tabela
     * 
     * @param coluna
     * @return String
     */
    @Override
    public String getColumnName(int coluna) {
        return this.colunas[coluna];
    }
    
    /**
     * Retorna a quantidade de elementos que 
     * existe na minha tabela;
     * @return int 
     */
    @Override
    public int getRowCount() {
        return dados.size();
    }

    /**
     * Retorna a quantidade de colunas que
     * existe na minha tabela
     * @return int
     */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /**
     * Retorna o valor de uma determinada célula da
     * tabela de acordo com a linha e a coluna
     * passada como parâmetro
     * 
     * @param linha
     * @param coluna
     * @return Object
     */
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0: return dados.get(linha).getId();
            case 1: return dados.get(linha).getPlaca();
            case 2: return dados.get(linha).getAno();
            case 3: return dados.get(linha).getCategoria();
            case 4: return dados.get(linha).getPropietario();
            case 5: return dados.get(linha).getMarca();
            case 6: return dados.get(linha).getMunicipio();
        }
        return null;
    }

    /**
     * Atualizar valor
     * 
     * @param valor
     * @param linha
     * @param coluna 
     */
    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna) {
            case 0: dados.get(linha).setId((int) valor);
                    break;
            case 1: dados.get(linha).setPlaca((String) valor);
                    break;
            case 2: dados.get(linha).setAno((Date) valor);
                    break;
            case 3: dados.get(linha).setCategoria((Categoria) valor);
                    break;
            case 4: dados.get(linha).setPropietario((Proprietario) valor);
                    break;
            case 5: dados.get(linha).setMarca((Marca) valor);
                    break;
            case 6: dados.get(linha).setMunicipio((Municipio) valor);
                    break;
         
        }
        this.fireTableRowsUpdated(linha, linha);
    }

}
    
    
    

