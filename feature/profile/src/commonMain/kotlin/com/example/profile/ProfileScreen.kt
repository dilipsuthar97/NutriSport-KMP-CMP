package com.example.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nutrisport.shared.Resources
import com.nutrisport.shared.component.PrimaryButton
import com.nutrisport.shared.component.ProfileForm

@Composable
fun ProfileScreen() {
    ProfileForm(
        firstName = "",
        onFirstNameChange = {},
        lastName = "",
        onLastNameChange = {},
        email = "",
        city = "",
        onCityChange = {},
        postalCode = null,
        onPostalCodeChange = {},
        address = "",
        onAddressChange = {},
        phoneNumber = null,
        onPhoneNumberChange = {},
    )
}