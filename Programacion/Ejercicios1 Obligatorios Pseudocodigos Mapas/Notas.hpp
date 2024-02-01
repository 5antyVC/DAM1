Funcion Aprobado (int N);

Funcion Aprobado (int N)
{
    switch(N)
    {
        case 1 
        if(N<5 & N>=0)
        {
            cout>>("Suspenso");
        }
        else if (N==5)
            {
                cout>>("Aprobado");

            }
                else if (N==6)
                {
                        cout>>("Bien");


                }
                    else if (N==7)
                    {
                            cout>>("Notable Bajo");


                    }
                        else if (N==8)
                            {
                                    cout>>("Notable Alto");


                            }
                            else if (N==9)
                            {
                                    cout>>("Sobresaliente");


                            }
                                else if (N==10)
                                {
                                        cout>>("Matricula de honor");


                                }
    }



    return N;
}

int main()
{


int Nota;
cout>>("Introduzca una nota entre el 0 y 10");
cin>>Nota;
if(Nota<0 || Nota>10)
{
    cout<<("Introduzca una nota valida");
}
else
{
Aprobado(int Nota);

}



return 0;

}