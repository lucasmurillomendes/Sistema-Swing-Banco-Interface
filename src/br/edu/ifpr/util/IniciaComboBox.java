/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.util;

import br.edu.ifpr.bean.Categoria;
import br.edu.ifpr.bean.Estado;
import br.edu.ifpr.bean.Marca;
import br.edu.ifpr.bean.Municipio;
import br.edu.ifpr.bean.Proprietario;
import br.edu.ifpr.bean.Veiculo;
import br.edu.ifpr.dao.CategoriaDAO;
import br.edu.ifpr.dao.EstadoDAO;
import br.edu.ifpr.dao.MarcaDAO;
import br.edu.ifpr.dao.MunicipioDAO;
import br.edu.ifpr.dao.ProprietarioDAO;
import br.edu.ifpr.dao.VeiculoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author lucas
 */
public class IniciaComboBox {

    private Connection con;
    private GenericComboBoxModel<Estado> modelEstado;
    private GenericComboBoxModel<Municipio> municipiomodel;
    private GenericComboBoxModel<Marca> marcaModel;
    private GenericComboBoxModel<Categoria> categoriaModel;
    private GenericComboBoxModel<Proprietario> proprietarioModel;
    private GenericComboBoxModel<Veiculo> veiculoModel;

    public IniciaComboBox() {
        try {
            this.con = ConnectionFactory.createConnectionToMySQL();
        } catch (SQLException ex) {
            Logger.getLogger(IniciaComboBox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciarComboBoxMarca(JComboBox<Marca> cbMarca) throws SQLException {
        marcaModel = new GenericComboBoxModel();
        MarcaDAO mcDAO = new MarcaDAO(con);
        for (int i = 1; i <= mcDAO.retornaQTD(); i++) {
            if (mcDAO.retrieve(i) != null) {
                Marca marca = mcDAO.retrieve(i);
                marcaModel.addElement(marca);
            }
        }
        cbMarca.setModel(marcaModel);
    }

    public void iniciarComboBoxCategoria(JComboBox<Categoria> cbCategoria) throws SQLException {
        categoriaModel = new GenericComboBoxModel();
        CategoriaDAO cDAO = new CategoriaDAO(con);

        for (int i = 1; i < cDAO.retornaQTD(); i++) {
            if (cDAO.retrieve(i) != null) {
                Categoria categoria = cDAO.retrieve(i);
                categoriaModel.addElement(categoria);
            }
        }
        cbCategoria.setModel(categoriaModel);
    }

    public void iniciarComboBoxEstado(JComboBox<Estado> comboEstado) throws SQLException {
        modelEstado = new GenericComboBoxModel();
        EstadoDAO estDAO = new EstadoDAO(con);

        for (int i = 1; i < estDAO.retornaQTD(); i++) {
            if (estDAO.retrieve(i) != null) {
                Estado estado = estDAO.retrieve(i);
                modelEstado.addElement(estado);
            }
        }
        comboEstado.setModel(modelEstado);
    }

    public void iniciarComboBoxMunicipio(JComboBox<Municipio> cbMunicipio) throws SQLException {
        municipiomodel = new GenericComboBoxModel();
        MunicipioDAO mDAO = new MunicipioDAO(con);

        for (int i = 1; i <= mDAO.retornaQTD(); i++) {
            if (mDAO.retrieve(i) != null) {
                Municipio municipio = mDAO.retrieve(i);
                municipiomodel.addElement(municipio);
            }
        }
        cbMunicipio.setModel(municipiomodel);
    }

    public void iniciarComboBoxVeiculo(JComboBox<Veiculo> cbVeiculo) throws SQLException {
        veiculoModel = new GenericComboBoxModel();
        VeiculoDAO vDAO = new VeiculoDAO(con);

        for (int i = 1; i <= vDAO.retornaQTD() + 1; i++) {
            if (vDAO.retrieve(i) != null) {
                Veiculo veiculo = vDAO.retrieve(i);
                veiculoModel.addElement(veiculo);
            }
        }
        cbVeiculo.setModel(veiculoModel);
    }

    public void iniciarComboBoxProprietario(JComboBox<Proprietario> cbProprietario) throws SQLException {
        proprietarioModel = new GenericComboBoxModel();
        ProprietarioDAO pDAO = new ProprietarioDAO(con);

        for (int i = 1; i <= pDAO.retornaQTD(); i++) {
            if (pDAO.retrieve(i) != null) {
                Proprietario proprietario = pDAO.retrieve(i);
                proprietarioModel.addElement(proprietario);
            }
        }
        cbProprietario.setModel(proprietarioModel);
    }
}
