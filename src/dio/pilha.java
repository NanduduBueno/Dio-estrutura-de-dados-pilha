package dio;

public class pilha {

    private no refnoEntradaPilha;

    public pilha() {
        this.refnoEntradaPilha = null;
    }

    public void push(no novoNo){
        no refAuxiliar = refnoEntradaPilha;
        refnoEntradaPilha = novoNo;
        refnoEntradaPilha.setrefno(refAuxiliar);
    }
    public no pop() {
        no noPoped = null;
        if (!this.isEmpty()) {
            noPoped = refnoEntradaPilha;
            refnoEntradaPilha = refnoEntradaPilha.getrefno();
        }
        return noPoped;
    }
    public no top(){
        return refnoEntradaPilha;
    }
    public boolean isEmpty(){
//        if(refnoEntradaPilha ==null){
//            return true;
//        }
//        return false;
        return this.refnoEntradaPilha == null;
    }
    @Override
    public String toString(){
        String stringRetorno = "============\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "=============\n";

        no noAuxiliar = refnoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado= " + noAuxiliar.getDado() +  "}]\n";
                noAuxiliar = noAuxiliar.getrefno();
            }else{
                break;
            }
        }
        stringRetorno += "=============\n";
        stringRetorno += "";
        return stringRetorno;
    }
}
