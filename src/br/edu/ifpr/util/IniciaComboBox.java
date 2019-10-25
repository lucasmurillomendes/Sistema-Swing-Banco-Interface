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
import java.util.List;
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
        List<Marca> marcas = mcDAO.findAll();

        for (Marca marca : marcas) {
            marcaModel.addElement(marca);
        }
        cbMarca.setModel(marcaModel);
    }

    public void iniciarComboBoxCategoria(JComboBox<Categoria> cbCategoria) throws SQLException {
        categoriaModel = new GenericComboBoxModel();
        CategoriaDAO cDAO = new CategoriaDAO(con);
        List<Categoria> categorias = cDAO.findAll();

        for (Categoria categoria : categorias) {
            categoriaModel.addElement(categoria);
        }
        cbCategoria.setModel(categoriaModel);
    }

    public void iniciarComboBoxEstado(JComboBox<Estado> comboEstado) throws SQLException {
        modelEstado = new GenericComboBoxModel();
        EstadoDAO estDAO = new EstadoDAO(con);

        List<Estado> lista = estDAO.findAll();
        for (Estado estado : lista) {
            modelEstado.addElement(estado);
        }
        comboEstado.setModel(modelEstado);
    }

    public void iniciarComboBoxMunicipio(JComboBox<Municipio> cbMunicipio) throws SQLException {
        municipiomodel = new GenericComboBoxModel();
        MunicipioDAO mDAO = new MunicipioDAO(con);
        List<Municipio> municipios = mDAO.findAll();

        for (Municipio municipio : municipios) {
            municipiomodel.addElement(municipio);
        }
        cbMunicipio.setModel(municipiomodel);
    }

    public void iniciarComboBoxVeiculo(JComboBox<Veiculo> cbVeiculo) throws SQLException {
        veiculoModel = new GenericComboBoxModel();
        VeiculoDAO vDAO = new VeiculoDAO(con);
        List<Veiculo> veiculos = vDAO.findAll();

        for (Veiculo veiculo : veiculos) {
            veiculoModel.addElement(veiculo);
        }
        cbVeiculo.setModel(veiculoModel);
    }

    public void iniciarComboBoxProprietario(JComboBox<Proprietario> cbProprietario) throws SQLException {
        proprietarioModel = new GenericComboBoxModel();
        ProprietarioDAO pDAO = new ProprietarioDAO(con);
        List<Proprietario> proprietarios = pDAO.findAll();

        for (Proprietario proprietario : proprietarios) {
            proprietarioModel.addElement(proprietario);
        }
        cbProprietario.setModel(proprietarioModel);
    }
}
