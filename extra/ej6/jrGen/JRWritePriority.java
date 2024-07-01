/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRWritePriority
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_done_voidTovoid;
	public Cap_ext_ JRget_op_done_voidTovoid() {
		return op_done_voidTovoid;
	}
	public void JRset_op_done_voidTovoid(Cap_ext_ op_done_voidTovoid) {
		this.op_done_voidTovoid = op_done_voidTovoid;
	}

	public Cap_ext_ op_writer_intTovoid;
	public Cap_ext_ JRget_op_writer_intTovoid() {
		return op_writer_intTovoid;
	}
	public void JRset_op_writer_intTovoid(Cap_ext_ op_writer_intTovoid) {
		this.op_writer_intTovoid = op_writer_intTovoid;
	}

	public Cap_ext_ op_reader_intTovoid;
	public Cap_ext_ JRget_op_reader_intTovoid() {
		return op_reader_intTovoid;
	}
	public void JRset_op_reader_intTovoid(Cap_ext_ op_reader_intTovoid) {
		this.op_reader_intTovoid = op_reader_intTovoid;
	}

	public JRWritePriority(JRWritePriority copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_writer_intTovoid = copy.op_writer_intTovoid;
	this.op_reader_intTovoid = copy.op_reader_intTovoid;

	}
	public JRWritePriority(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_writer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_reader_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRWritePriority(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_writer_intTovoid = Cap_ext_.noop;
	this.op_reader_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRWritePriority(true);
	}
    }
