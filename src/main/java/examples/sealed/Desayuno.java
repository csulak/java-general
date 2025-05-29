package examples.sealed;

public sealed class Desayuno permits Tostada, Cafe
{
    // aca podrian ir todas las propiedades que comparten los hijos
    // Una sealed class tambien podria ser una interfaz
}
