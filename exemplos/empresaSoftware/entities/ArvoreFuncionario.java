package empresaSoftware.entities;

public class ArvoreFuncionario {
    private NodeFuncionario root;

    public ArvoreFuncionario(){
        root = null;
    }

    private NodeFuncionario inserirRecursivo(NodeFuncionario nodeFuncionario, FuncionarioBase funcionario){
        if(nodeFuncionario == null){
            return new NodeFuncionario(funcionario);
        }
        if(funcionario.getNomeFuncionario().compareTo(nodeFuncionario.getNomeFuncionario()) < 0){
            nodeFuncionario.leftChild = inserirRecursivo(nodeFuncionario.leftChild, funcionario);
        }
        else if (funcionario.getNomeFuncionario().compareTo(nodeFuncionario.getNomeFuncionario()) > 0){
            nodeFuncionario.rightChild = inserirRecursivo(nodeFuncionario.rightChild, funcionario);
        }
        return nodeFuncionario;
    }

    private void inserirNodeFuncionario(FuncionarioBase funcionario){
        root = inserirRecursivo(root, funcionario);
    }
}
