/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class prog extends java.lang.Object {
    { JRinit(); }
    
    public prog() {
        // Begin Expr2
        super();
        JRprocess();
    }
    static final int N = 20;
    static Op_ext.JRProxyOp JRget_op_despertar_dormir_javadotlangdotStringTovoid()
    {
        return op_despertar_dormir_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_despertar_dormir_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_despertar_dormir_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_confirmar_despegar_javadotlangdotStringTovoid()
    {
        return op_confirmar_despegar_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_confirmar_despegar_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_confirmar_despegar_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_l1_javadotlangdotStringTovoid()
    {
        return op_l1_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_l1_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_l1_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_l2_javadotlangdotStringTovoid()
    {
        return op_l2_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_l2_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_l2_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_l3_javadotlangdotStringTovoid()
    {
        return op_l3_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_l3_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_l3_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_mutex_javadotlangdotStringTovoid()
    {
        return op_mutex_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutex_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_mutex_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static int[] lineas = new int[3];
    static {
        JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
    }
    
    static int maximo(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacio o ser null");
        }
        int maxIndex = 0;
        JRLoop0: for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                // Begin Expr2
                maxIndex = i;
            }
        }
        // Return
        return (maxIndex);
        // End Return

    }
    static Op_ext.JRProxyOp JRget_op_Control_voidTovoid()
    {
        return op_Control_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_Control_voidTovoid;
    static class ProcOp_voidTovoid_implControl extends ProcOp_ext_impl
    {
        public ProcOp_voidTovoid_implControl(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.ControlvoidTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    prog.ControlvoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    ;
    static    {
        try    {
            op_Control_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implControl(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static void ControlvoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Control_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void ControlvoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                String mensaje = /*JR init for inni*/ null;
                int lineaMasCongestionada = /*JR init for inni*/ 0;
                JRLoop1: while (true) {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_despertar_dormir_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutex_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    lineaMasCongestionada = maximo(lineas);
                    JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                    switch (lineaMasCongestionada) {
                    case 1: 
                        JRget_op_l1_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        break;
                    
                    case 2: 
                        JRget_op_l2_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        break;
                    
                    case 3: 
                        JRget_op_l3_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                        break;
                    
                    }
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_confirmar_despegar_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                }
            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    static {
        try {
            op_Control_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    static Op_ext.JRProxyOp JRget_op_Avion_intTovoid()
    {
        return op_Avion_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_Avion_intTovoid;
    static class ProcOp_intTovoid_implAvion extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implAvion(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.AvionintTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    prog.AvionintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    ;
    static    {
        try    {
            op_Avion_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implAvion(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static void AvionintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Avion_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void AvionintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                String mensaje = /*JR init for inni*/ null;
                int linea = ((int)Math.random()) * 3;
                // Receive
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutex_javadotlangdotStringTovoid().recv();
                    mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                    jrvm.ariseAndReceive();
                    if (recv_javadotlangdotStringTovoid.retOp != null)
                        recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // End Receive
                
                // Begin Expr2
                lineas[linea]++;
                JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                JRget_op_despertar_dormir_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                switch (linea) {
                case 1: 
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_l1_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    break;
                
                case 2: 
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_l2_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    break;
                
                case 3: 
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_l3_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    break;
                
                }
                // Receive
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutex_javadotlangdotStringTovoid().recv();
                    mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                    jrvm.ariseAndReceive();
                    if (recv_javadotlangdotStringTovoid.retOp != null)
                        recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // End Receive
                
                // Begin Expr2
                lineas[linea]--;
                JRget_op_mutex_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                JRget_op_confirmar_despegar_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    static {
        try {
            for (int i = 0; i < N; i++) {
                op_Avion_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
            }
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    
    public static void main(String... args) {
    }
    protected boolean JRcalled = false;
    protected JRprog jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRprog(op_Avion_intTovoid, op_Control_voidTovoid, op_mutex_javadotlangdotStringTovoid, op_l3_javadotlangdotStringTovoid, op_l2_javadotlangdotStringTovoid, op_l1_javadotlangdotStringTovoid, op_confirmar_despegar_javadotlangdotStringTovoid, op_despertar_dormir_javadotlangdotStringTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
