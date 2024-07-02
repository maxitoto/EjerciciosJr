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
	public Cap_ext_ op_medico_intTovoid;
	public Cap_ext_ JRget_op_medico_intTovoid() {
		return op_medico_intTovoid;
	}
	public void JRset_op_medico_intTovoid(Cap_ext_ op_medico_intTovoid) {
		this.op_medico_intTovoid = op_medico_intTovoid;
	}

	public Cap_ext_ op_paciente_intTovoid;
	public Cap_ext_ JRget_op_paciente_intTovoid() {
		return op_paciente_intTovoid;
	}
	public void JRset_op_paciente_intTovoid(Cap_ext_ op_paciente_intTovoid) {
		this.op_paciente_intTovoid = op_paciente_intTovoid;
	}

	public Cap_ext_ op_recepcionista_voidTovoid;
	public Cap_ext_ JRget_op_recepcionista_voidTovoid() {
		return op_recepcionista_voidTovoid;
	}
	public void JRset_op_recepcionista_voidTovoid(Cap_ext_ op_recepcionista_voidTovoid) {
		this.op_recepcionista_voidTovoid = op_recepcionista_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_medico_intTovoid = copy.op_medico_intTovoid;
	this.op_paciente_intTovoid = copy.op_paciente_intTovoid;
	this.op_recepcionista_voidTovoid = copy.op_recepcionista_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_medico_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_paciente_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_recepcionista_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_medico_intTovoid = Cap_ext_.noop;
	this.op_paciente_intTovoid = Cap_ext_.noop;
	this.op_recepcionista_voidTovoid = Cap_ext_.noop;

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
