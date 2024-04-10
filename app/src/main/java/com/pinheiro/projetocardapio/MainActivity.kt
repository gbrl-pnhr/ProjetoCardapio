package com.pinheiro.projetocardapio

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.pinheiro.projetocardapio.databinding.ActivityMainBinding
import com.pinheiro.projetocardapio.databinding.CustomDialogBinding

class MainActivity : AppCompatActivity() {

    private var soma = 0.0f
    private val tarter = 39.0f
    private val gougeres = 43.0f
    private val canapes = 52.0f
    private val raclette = 52.0f
    private val steak = 75.0f
    private val rice = 68.0f
    private val tuna = 81.0f
    private val boeuf = 76.0f
    private val lemonade = 10.0f
    private val soda = 7.5f
    private val water = 6.5f
    private val coffee = 7.0f
    private val perdu = 27.0f
    private val profiteroles = 28.0f
    private val creme = 26.0f
    private val mousse = 29.0f
    val resumeOrder = ArrayList<String>()
    val resumePrice = ArrayList<String>()

    private lateinit var dialog: AlertDialog

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textBottom.text = "TOTAL: R$ ${this.soma}"

        //configuração dos checkboxes individuais
        binding.checkBoxTarter.setOnClickListener {
            if (binding.checkBoxTarter.isChecked) {
                this.soma += tarter
                resumeOrder.add("Tarte Flambée")
                resumePrice.add(tarter.toString())
            } else {
                soma -= tarter
                resumeOrder.remove("Tarte Flambée")
                resumePrice.remove(tarter.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }

        binding.checkBoxGougeres.setOnClickListener {
            if (binding.checkBoxGougeres.isChecked) {
                this.soma += gougeres
                resumeOrder.add("Gougêres")
                resumePrice.add(gougeres.toString())
            } else {
                soma -= gougeres
                resumeOrder.remove("Gougêres")
                resumePrice.remove(gougeres.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }

        binding.checkBoxCanapes.setOnClickListener {
            if (binding.checkBoxCanapes.isChecked) {
                this.soma += canapes
                resumeOrder.add("Canapés de Steak Tartare")
                resumePrice.add(canapes.toString())
            } else {
                soma -= canapes
                resumeOrder.remove("Canapés de Steak Tartare")
                resumePrice.remove(canapes.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }

        binding.checkBoxRaclette.setOnClickListener {
            if (binding.checkBoxRaclette.isChecked) {
                this.soma += raclette
                resumeOrder.add("Pastel de Queijo Raclette")
                resumePrice.add(raclette.toString())
            } else {
                soma -= raclette
                resumeOrder.remove("Pastel de Queijo Raclette")
                resumePrice.remove(raclette.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }

        binding.checkBoxSteak.setOnClickListener {
            if (binding.checkBoxSteak.isChecked) {
                this.soma += steak
                resumeOrder.add("Steak Frites")
                resumePrice.add(steak.toString())
            } else {
                soma -= steak
                resumeOrder.remove("Steak Frites")
                resumePrice.remove(steak.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }

        binding.checkBoxRice.setOnClickListener {
            if (binding.checkBoxRice.isChecked) {
                this.soma += rice
                resumeOrder.add("Arroz de pato")
                resumePrice.add(rice.toString())
            } else {
                soma -= rice
                resumeOrder.remove("Arroz de pato")
                resumePrice.remove(rice.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxTuna.setOnClickListener {
            if (binding.checkBoxTuna.isChecked) {
                this.soma += tuna
                resumeOrder.add("Atum \"Mi-Cuit\" do Ici Bistrô")
                resumePrice.add(tuna.toString())
            } else {
                soma -= tuna
                resumeOrder.remove("Atum \"Mi-Cuit\" do Ici Bistrô")
                resumePrice.remove(tuna.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxBoeuf.setOnClickListener {
            if (binding.checkBoxBoeuf.isChecked) {
                this.soma += boeuf
                resumeOrder.add("Boeuf Bourguignon")
                resumePrice.add(boeuf.toString())
            } else {
                soma -= boeuf
                resumeOrder.remove("Boeuf Bourguignon")
                resumePrice.remove(boeuf.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxLemonade.setOnClickListener {
            if (binding.checkBoxLemonade.isChecked) {
                this.soma += lemonade
                resumeOrder.add("Lemonade")
                resumePrice.add(lemonade.toString())
            } else {
                soma -= lemonade
                resumeOrder.remove("Lemonade")
                resumePrice.add(lemonade.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxSoda.setOnClickListener {
            if (binding.checkBoxSoda.isChecked) {
                this.soma += soda
                resumeOrder.add("Refrigerante")
                resumePrice.add(soda.toString())
            } else {
                soma -= soda
                resumeOrder.remove("Refrigerante")
                resumePrice.remove(soda.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxWater.setOnClickListener {
            if (binding.checkBoxWater.isChecked) {
                this.soma += water
                resumeOrder.add("Água")
                resumePrice.add(water.toString())
            } else {
                soma -= water
                resumeOrder.remove("Água")
                resumePrice.remove(water.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxCoffee.setOnClickListener {
            if (binding.checkBoxCoffee.isChecked) {
                this.soma += coffee
                resumeOrder.add("Café expresso")
                resumePrice.add(coffee.toString())
            } else {
                soma -= coffee
                resumeOrder.remove("Café expresso")
                resumePrice.remove(coffee.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxPerdu.setOnClickListener {
            if (binding.checkBoxPerdu.isChecked) {
                this.soma += perdu
                resumeOrder.add("Pain Perdu")
                resumePrice.add(perdu.toString())
            } else {
                soma -= perdu
                resumeOrder.remove("Pain Perdu")
                resumePrice.remove(perdu.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxProfiteroles.setOnClickListener {
            if (binding.checkBoxProfiteroles.isChecked) {
                this.soma += profiteroles
                resumeOrder.add("Profiteroles")
                resumePrice.add(profiteroles.toString())
            } else {
                soma -= profiteroles
                resumeOrder.remove("Profiteroles")
                resumePrice.remove(profiteroles.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxCreme.setOnClickListener {
            if (binding.checkBoxCreme.isChecked) {
                this.soma += creme
                resumeOrder.add("Crême Brûlée")
                resumePrice.add(creme.toString())
            } else {
                soma -= creme
                resumeOrder.remove("Crême Brûlée")
                resumePrice.remove(creme.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }
        binding.checkBoxMousse.setOnClickListener {
            if (binding.checkBoxMousse.isChecked) {
                this.soma += mousse
                resumeOrder.add("Mousse au Chocolat")
                resumePrice.add(mousse.toString())
            } else {
                soma -= mousse
                resumeOrder.remove("Mousse au Chocolat")
                resumePrice.remove(mousse.toString())
            }
            binding.textBottom.text = "TOTAL: R$ ${this.soma}"
        }

        //Botaão de comprar
        binding.buttonBuy.setOnClickListener {
            if (soma == 0f) {
                Toast.makeText(this, R.string.validation_checkBox, Toast.LENGTH_SHORT).show()
            } else {
                showDialog()
            }
        }

        //Configuração dos botões que facilitam a navegação
        binding.buttonEntry.setOnClickListener {
            binding.scrollView.smoothScrollTo(0, 0)
        }

        binding.buttonMainCourses.setOnClickListener {
            binding.scrollView.smoothScrollTo(0, (binding.textCanapesTime.top))
        }

        binding.buttonDrinks.setOnClickListener {
            binding.scrollView.smoothScrollTo(0, binding.textDrinks.bottom)
        }

        binding.buttonDeserts.setOnClickListener {
            binding.scrollView.smoothScrollTo(0, binding.textDeserts.bottom)
        }
        //fim da main.
    }

    //Função para o Alert
    private fun showDialog() {
        val build = AlertDialog.Builder(this, R.style.ThemeAlertDialog)
        val dialogBinding: CustomDialogBinding = CustomDialogBinding
            .inflate(LayoutInflater.from(this))

        //impressão dos Arrays dos pedidos e preços + a quebra de linha
        dialogBinding.textRequests.text = resumeOrder.joinToString("\n")
        dialogBinding.textResumePrices.text = ("R$ " + resumePrice.joinToString("0\nR$ ") + "0")
        dialogBinding.textResumeTotal.text = ("TOTAL: R$ " + soma + "0")

        dialogBinding.buttonClosed.setOnClickListener { dialog.dismiss() }

        dialogBinding.buttonConclution.setOnClickListener {
            Toast.makeText(this, R.string.text_finally, Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }

        build.setView(dialogBinding.root)

        dialog = build.create()
        dialog.show()

    }
}
