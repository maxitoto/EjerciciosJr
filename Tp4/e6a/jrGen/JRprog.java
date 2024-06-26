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
	public Cap_ext_ op_leer_intTovoid;
	public Cap_ext_ JRget_op_leer_intTovoid() {
		return op_leer_intTovoid;
	}
	public void JRset_op_leer_intTovoid(Cap_ext_ op_leer_intTovoid) {
		this.op_leer_intTovoid = op_leer_intTovoid;
	}

	public Cap_ext_ op_escribir_intTovoid;
	public Cap_ext_ JRget_op_escribir_intTovoid() {
		return op_escribir_intTovoid;
	}
	public void JRset_op_escribir_intTovoid(Cap_ext_ op_escribir_intTovoid) {
		this.op_escribir_intTovoid = op_escribir_intTovoid;
	}

	public Cap_ext_ op_escritorEsperando_intTovoid;
	public Cap_ext_ JRget_op_escritorEsperando_intTovoid() {
		return op_escritorEsperando_intTovoid;
	}
	public void JRset_op_escritorEsperando_intTovoid(Cap_ext_ op_escritorEsperando_intTovoid) {
		this.op_escritorEsperando_intTovoid = op_escritorEsperando_intTovoid;
	}

	public Cap_ext_ op_lectoresEsperando_intTovoid;
	public Cap_ext_ JRget_op_lectoresEsperando_intTovoid() {
		return op_lectoresEsperando_intTovoid;
	}
	public void JRset_op_lectoresEsperando_intTovoid(Cap_ext_ op_lectoresEsperando_intTovoid) {
		this.op_lectoresEsperando_intTovoid = op_lectoresEsperando_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_leer_intTovoid = copy.op_leer_intTovoid;
	this.op_escribir_intTovoid = copy.op_escribir_intTovoid;
	this.op_escritorEsperando_intTovoid = copy.op_escritorEsperando_intTovoid;
	this.op_lectoresEsperando_intTovoid = copy.op_lectoresEsperando_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_leer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_escribir_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_escritorEsperando_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_lectoresEsperando_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_leer_intTovoid = Cap_ext_.noop;
	this.op_escribir_intTovoid = Cap_ext_.noop;
	this.op_escritorEsperando_intTovoid = Cap_ext_.noop;
	this.op_lectoresEsperando_intTovoid = Cap_ext_.noop;

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
