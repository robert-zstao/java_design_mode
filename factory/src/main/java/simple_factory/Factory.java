package simple_factory;

/**
 *
 * 简单工厂
 * @author robert
 * @date 2021/5/12 14:04
 */
public class Factory {

    //工厂方法，需要乘就new 乘法的对象
    public static Operation getFactory(String method){
        Operation opr = null;
        switch (method){

            case "+":
                opr = new Add();
                break;

            case "-":
                opr = new OperationSub();
                break;

            case "*":
                opr = new OperationMul();
                break;

            case "/":
                opr = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作!");
        }

        return opr;
    }
}
