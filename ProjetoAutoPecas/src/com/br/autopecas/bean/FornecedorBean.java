package com.br.autopecas.bean;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import com.br.autopecas.dao.DAO;
import com.br.autopecas.enums.TipoFabricaEnum;
import com.br.autopecas.model.Fornecedor;

@ManagedBean
@RequestScoped
public class FornecedorBean {

	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> fornecedores = listaTodos();

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void cadastrarFornecedor() {
		System.out.println("Fornecedor cadastrado: " + fornecedor.getDescricao());
		new DAO<Fornecedor>(Fornecedor.class).adiciona(fornecedor);
		fornecedor = new Fornecedor();
	}

	public List<Fornecedor> listaTodos() {
		return new DAO<Fornecedor>(Fornecedor.class).listaTodos();
	}

	public TipoFabricaEnum[] getTipoFabrica() {
		return TipoFabricaEnum.values();
	}

	public void validaNomeEmpresa(FacesContext fc, UIComponent component, Object value) throws ValidatorException {
		Optional<String> val1 = Optional.of(value.toString());
		
		

		val1.ifPresent(valor -> {
			if (valor.contains("NeoGrid"))
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Nome do fornecedor não pode ser Neogrid",""));
		});

	}

}
