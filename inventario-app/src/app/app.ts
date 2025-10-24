import { Component, signal } from '@angular/core';
import { ProductoLista } from "./producto-lista/producto-lista";
import { RouterLink, RouterLinkActive, RouterModule, RouterOutlet } from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  styleUrl: './app.css',
  imports: [RouterLink, RouterLinkActive, RouterOutlet, RouterModule]
})
export class App {
  protected readonly title = signal('inventario-app');
}
