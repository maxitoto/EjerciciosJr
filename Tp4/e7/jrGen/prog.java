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
    static int cantC = 10;
    static int cantB = 3;
    static Op_ext.JRProxyOp JRget_op_sillonDeEspera_javadotlangdotStringTovoid()
    {
        return op_sillonDeEspera_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_sillonDeEspera_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_sillonDeEspera_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static int contClEsperando = 0;
    static Op_ext.JRProxyOp JRget_op_barberoduerme_javadotlangdotStringTovoid()
    {
        return op_barberoduerme_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_barberoduerme_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_barberoduerme_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static int barberoDisponible = 3;
    static Op_ext.JRProxyOp JRget_op_cortaAlCLiente_javadotlangdotStringTovoid()
    {
        return op_cortaAlCLiente_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_cortaAlCLiente_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_cortaAlCLiente_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_leCortaElBarbero_javadotlangdotStringTovoid()
    {
        return op_leCortaElBarbero_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_leCortaElBarbero_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_leCortaElBarbero_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_cobrar_javadotlangdotStringTovoid()
    {
        return op_cobrar_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_cobrar_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_cobrar_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_paga_javadotlangdotStringTovoid()
    {
        return op_paga_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_paga_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_paga_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_mutexA_javadotlangdotStringTovoid()
    {
        return op_mutexA_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutexA_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_mutexA_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_mutexB_javadotlangdotStringTovoid()
    {
        return op_mutexB_javadotlangdotStringTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutexB_javadotlangdotStringTovoid;
    ;
    static    {
        try    {
            op_mutexB_javadotlangdotStringTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static {
        JRget_op_mutexA_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
        JRget_op_mutexB_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
    }
    static Op_ext.JRProxyOp JRget_op_clientes_intTovoid()
    {
        return op_clientes_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_clientes_intTovoid;
    static class ProcOp_intTovoid_implclientes extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implclientes(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.clientesintTovoid(null, null, null, JRargs);
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
                    prog.clientesintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
            op_clientes_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implclientes(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static void clientesintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_clientes_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void clientesintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                String mensaje = "" + i;
                // Begin Expr2
                contClEsperando++;
                if (barberoDisponible == 0) {
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_sillonDeEspera_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                }
                // Begin Expr2
                contClEsperando--;
                // Begin Expr2
                barberoDisponible--;
                JRget_op_barberoduerme_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {"" + i});
                JRget_op_leCortaElBarbero_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {"" + i});
                // Receive
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_javadotlangdotStringTovoid = JRget_op_cortaAlCLiente_javadotlangdotStringTovoid().recv();
                    mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                    jrvm.ariseAndReceive();
                    if (recv_javadotlangdotStringTovoid.retOp != null)
                        recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // End Receive
                
                // Begin Expr2
                System.out.println("barbero " + mensaje + " me corta el cabello");
                String mute = /*JR init for inni*/ null;
                // Receive
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutexA_javadotlangdotStringTovoid().recv();
                    mute = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                    jrvm.ariseAndReceive();
                    if (recv_javadotlangdotStringTovoid.retOp != null)
                        recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // End Receive
                
                JRget_op_cobrar_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {"" + i});
                // Receive
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_javadotlangdotStringTovoid = JRget_op_paga_javadotlangdotStringTovoid().recv();
                    mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                    jrvm.ariseAndReceive();
                    if (recv_javadotlangdotStringTovoid.retOp != null)
                        recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // End Receive
                
                // Begin Expr2
                System.out.println("Le pago al barbero " + mensaje);
                JRget_op_mutexB_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
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
            for (int i = 0; i < cantC; i++) {
                op_clientes_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
            }
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    static Op_ext.JRProxyOp JRget_op_barberos_intTovoid()
    {
        return op_barberos_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_barberos_intTovoid;
    static class ProcOp_intTovoid_implbarberos extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implbarberos(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.barberosintTovoid(null, null, null, JRargs);
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
                    prog.barberosintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
            op_barberos_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implbarberos(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static void barberosintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_barberos_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void barberosintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                String mensaje = "";
                JRLoop0: while (true) {
                    if (contClEsperando > 0) {
                        // Receive
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_javadotlangdotStringTovoid = JRget_op_barberoduerme_javadotlangdotStringTovoid().recv();
                            mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                            jrvm.ariseAndReceive();
                            if (recv_javadotlangdotStringTovoid.retOp != null)
                                recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                        // End Receive
                        
                    } else {
                        JRget_op_sillonDeEspera_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {"Siguiente!!, al a silla " + i});
                    }
                    // Begin Expr2
                    System.out.println("Soy el barbero " + i + " y atiendo al cliente " + mensaje);
                    JRget_op_cortaAlCLiente_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {"" + i});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_leCortaElBarbero_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    System.out.println("Al cliente " + mensaje + " le corto el pelo");
                    String mute = /*JR init for inni*/ null;
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_mutexB_javadotlangdotStringTovoid().recv();
                        mute = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    JRget_op_paga_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {"" + i});
                    // Receive
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_javadotlangdotStringTovoid = JRget_op_cobrar_javadotlangdotStringTovoid().recv();
                        mensaje = (java.lang.String) recv_javadotlangdotStringTovoid.JRargs[0];
                        jrvm.ariseAndReceive();
                        if (recv_javadotlangdotStringTovoid.retOp != null)
                            recv_javadotlangdotStringTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // End Receive
                    
                    // Begin Expr2
                    System.out.println("Le cobro al cliente " + mensaje);
                    JRget_op_mutexA_javadotlangdotStringTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {""});
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
            for (int i = 1; i < cantB + 1; i++) {
                op_barberos_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
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
    	jrresref = new JRprog(op_barberos_intTovoid, op_clientes_intTovoid, op_mutexB_javadotlangdotStringTovoid, op_mutexA_javadotlangdotStringTovoid, op_paga_javadotlangdotStringTovoid, op_cobrar_javadotlangdotStringTovoid, op_leCortaElBarbero_javadotlangdotStringTovoid, op_cortaAlCLiente_javadotlangdotStringTovoid, op_barberoduerme_javadotlangdotStringTovoid, op_sillonDeEspera_javadotlangdotStringTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
