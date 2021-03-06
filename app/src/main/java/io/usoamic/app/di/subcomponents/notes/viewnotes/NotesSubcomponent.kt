package io.usoamic.app.di.subcomponents.notes.viewnotes

import dagger.Subcomponent
import io.usoamic.commons.crossplatform.scopes.AccountScope
import io.usoamic.app.ui.main.notes.viewnotes.NotesFragment

@AccountScope
@Subcomponent
interface NotesSubcomponent {
    fun inject(notesFragment: NotesFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): NotesSubcomponent
    }
}