/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRprog
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_autocruzaSurAnorte_intTovoid;
	public Cap_ext_ JRget_op_autocruzaSurAnorte_intTovoid() {
		return op_autocruzaSurAnorte_intTovoid;
	}
	public void JRset_op_autocruzaSurAnorte_intTovoid(Cap_ext_ op_autocruzaSurAnorte_intTovoid) {
		this.op_autocruzaSurAnorte_intTovoid = op_autocruzaSurAnorte_intTovoid;
	}

	public Cap_ext_ op_autocruzaNorteAsur_intTovoid;
	public Cap_ext_ JRget_op_autocruzaNorteAsur_intTovoid() {
		return op_autocruzaNorteAsur_intTovoid;
	}
	public void JRset_op_autocruzaNorteAsur_intTovoid(Cap_ext_ op_autocruzaNorteAsur_intTovoid) {
		this.op_autocruzaNorteAsur_intTovoid = op_autocruzaNorteAsur_intTovoid;
	}

	public Cap_ext_ op_cruzar_intTovoid;
	public Cap_ext_ JRget_op_cruzar_intTovoid() {
		return op_cruzar_intTovoid;
	}
	public void JRset_op_cruzar_intTovoid(Cap_ext_ op_cruzar_intTovoid) {
		this.op_cruzar_intTovoid = op_cruzar_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_autocruzaSurAnorte_intTovoid = copy.op_autocruzaSurAnorte_intTovoid;
	this.op_autocruzaNorteAsur_intTovoid = copy.op_autocruzaNorteAsur_intTovoid;
	this.op_cruzar_intTovoid = copy.op_cruzar_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_autocruzaSurAnorte_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_autocruzaNorteAsur_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_cruzar_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_autocruzaSurAnorte_intTovoid = Cap_ext_.noop;
	this.op_autocruzaNorteAsur_intTovoid = Cap_ext_.noop;
	this.op_cruzar_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRprog(true);
	}
    }
