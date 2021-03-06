package kg.geektech.taskapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import kg.geektech.taskapp.databinding.FragmentFourthBinding;
import kg.geektech.taskapp.databinding.FragmentNotificationsBinding;
import kg.geektech.taskapp.ui.notifications.NotificationsViewModel;

public class FourthFragment extends Fragment{
        private FragmentFourthBinding binding;
        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            binding = FragmentFourthBinding.inflate(inflater, container, false);
            View root = binding.getRoot();
            return root;

        }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClick();
    }

    private void onClick() {
        binding.btnTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivity(intent);


            }
        });

    }
    }


