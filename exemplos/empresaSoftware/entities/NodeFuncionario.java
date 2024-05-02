package empresaSoftware.entities;

public class NodeFuncionario extends FuncionarioBase{
    FuncionarioBase funcionario;
    NodeFuncionario leftChild;
    NodeFuncionario rightChild;

    public NodeFuncionario(FuncionarioBase funcionario){
        this.funcionario = funcionario;
        leftChild = null;
        rightChild = null;
    }

}
