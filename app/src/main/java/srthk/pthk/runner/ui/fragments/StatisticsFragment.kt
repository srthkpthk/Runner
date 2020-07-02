package srthk.pthk.runner.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import srthk.pthk.runner.R
import srthk.pthk.runner.ui.viewmodels.StatisticsViewModel
@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
    private val viewModel : StatisticsViewModel by viewModels()

}