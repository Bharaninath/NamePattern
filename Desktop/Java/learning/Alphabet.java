package learning;
public class Alphabet 
{
        void A(int n, int i) 
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 && i>0 || i==0 && j<n-1 && j>0 || i==(n-1)/2 || j==(n-1) && i>0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        
        void B(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 && j<n-1 && j>0 || i==(n-1)/2 && j<n-1 || 
                j==(n-1) && i>0 && i!=(n-1)/2 && i<(n-1) || i==n-1 && j<n-1 && j>0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }



        void C(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 && i>0 && i<(n-1) || i==0 && j>0 || i==(n-1) && j>0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        void D(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 && j<n-1 || i==(n-1) && j<n-1 || j==n-1 && i>0 && i<n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }


        void E(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 || i==(n-1) || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }


        void F(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0  || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void G(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 || i==(n-1) || i==(n-1)/2 && j>(n-1)/2 || j==n-1 && i>(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void H(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==(n-1) || i==(n-1)/2) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }


        void I(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==(n-1)/2 || i==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void J(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==(n-1)/2 || i==(n-1)&& j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void K(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void L(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void M(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==(n-1) || i==j && j<=(n-1)/2 || i+j==(n-1) && j>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void N(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==j|| j==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void O(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==(n-1) || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void P(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==(n-1) && i<=(n-1)/2 || i==0 || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void Q(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==(n-1) || j==0 || j==n-1 || i==j && j>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void R(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0  || j==(n-1)/2 && i<=(n-1)/2 || i==0 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2|| i-j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void S(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 || j==0 && i<(n-1)/2 && i>0|| i==(n-1)/2 && j<n-1 && j>0|| j==n-1 && i>(n-1)/2 && i<n-1 || i==n-1 && j<n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void T(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void U(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 && i<(n-1) || i==(n-1) && j<(n-1) && j>0|| j==n-1 && i<n-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void V(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i-j==(n-1)/2 || i+j==n-1 + (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void W(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||j==n-1||i==j && i>=(n-1)/2 || i+j==(n-1) && i>=(n-1)/2 ) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void X(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j||i+j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void Y(int n, int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j && j<=(n-1)/2 || i+j == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        void Z(int n , int i)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || i+j == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
}
