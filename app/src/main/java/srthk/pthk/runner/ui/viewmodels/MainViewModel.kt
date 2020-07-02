package srthk.pthk.runner.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import srthk.pthk.runner.respository.MainRepository

class MainViewModel @ViewModelInject constructor(val mainRepository: MainRepository) : ViewModel() {



}